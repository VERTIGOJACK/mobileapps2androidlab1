package se.vertigodigital.mobileapps2lab1.ui.publications;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import se.vertigodigital.mobileapps2lab1.R;
import se.vertigodigital.mobileapps2lab1.classes.latestupload.Show;
import se.vertigodigital.mobileapps2lab1.databinding.FragmentShowBinding;

//extends internal class viewholder, we need to define custom behavior
public class PublicationsRecyclerViewAdapter extends RecyclerView.Adapter<PublicationsRecyclerViewAdapter.ViewHolder> {
    // variable to store the shows that we recieve from the api
    private final List<Show> mShows;

    //constructor for the adapter
    public PublicationsRecyclerViewAdapter(List<Show> items) {
            //set input list to internal variable
            mShows = items;
    }

    @Override
    public int getItemCount() {
        return mShows.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Inflate the layout for a single item view here
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // get an inflated view using binding
        FragmentShowBinding binding = FragmentShowBinding.inflate(inflater, parent, false);

        // Create a new ViewHolder and pass the inflated view to it
        return new ViewHolder(binding);
    }

    //what should happen when we bind adapter to viewholder
    //seems to be some kind of loop where position is used for index
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        System.out.println(getItemCount());


            //QoL storage
            Show item = mShows.get(position);

            //image view loading with picasso
            if(item.getImageurl() != null){
                Picasso.get().load(item.getImageurl()).into(holder.mImageView);
            }

            if(item.getType() != null){
                holder.mTypeView.setText(item.getType());
            }

            if (item.getTitle() != null) {
                //titles sometimes contain timestamps, we use regex to remove
                String title = item.getTitle();
                String result = title.replaceAll("[^a-zA-ZåäöÅÄÖ\\s-.,]", "");
                holder.mTitleView.setText(result);
            }
            if (item.getProgram() != null){
                if(item.getProgram().getName() != null) {
                    holder.mProgramNameView.setText(item.getProgram().getName());
                }
            }

            // TODO: probably do some calcs here for both date and duration bofore setting
            if( item.getDateutc() != null) {

                //save date string
                String dateString = item.getDateutc();

                // Extract the timestamp (chatgpt provided regex)
                dateString = dateString.replaceAll("/Date\\(|\\)/", "");

                // parse string to long
                long timestamp = Long.parseLong(dateString);

                // convert to date
                Date date = new Date(timestamp);

                //declare date format
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

                holder.mDateView.setText(dateFormat.format(date));
            }

            if (item.getListenpodfile() != null) {
                if(item.getListenpodfile().getDuration() != null) {
                    int duration = item.getListenpodfile().getDuration();


                    int minutes = duration / 60;
                    int seconds = duration % 60;

                    // Format the result with zero-padding
                    //"%d" specifies that you want to format an integer.
                    //"02" specifies the minimum width of the field,

                    String formattedTime = String.format("%02d:%02d", minutes, seconds);

                    holder.mDurationView.setText(formattedTime);
                }
            }

    }

    //Internal class ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {

        // ... wasnt the whole point of binding that we didnt have to do this stuff ? ok.
        public final TextView mTypeView;
        public final ImageView mImageView;
        public final TextView mTitleView;
        public final TextView mProgramNameView;
        public final TextView mDateView;
        public final TextView mDurationView;

        // ?
        public Show mItem;

        //map to the view
        public ViewHolder(FragmentShowBinding binding) {
                super(binding.getRoot());
                //title and description are ids in fragment_book.xml
                mTypeView = binding.type;
                mImageView = binding.showImage;
                mTitleView = binding.title;
                mProgramNameView = binding.programName;
                mDateView = binding.publishDate;
                mDurationView = binding.audioDuration;
            }
        }
    }

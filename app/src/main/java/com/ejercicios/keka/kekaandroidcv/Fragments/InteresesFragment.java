package com.ejercicios.keka.kekaandroidcv.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ejercicios.keka.kekaandroidcv.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InteresesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InteresesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InteresesFragment extends Fragment {

     /*imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {

            public View makeView() {
                return new ImageView(LoginActivity.this);
            }
        });*/

    // Set animations
    // https://danielme.com/2013/08/18/diseno-android-transiciones-entre-activities/
        /*Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        imageSwitcher.setInAnimation(fadeIn);
        imageSwitcher.setOutAnimation(fadeOut);

        if (timer != null) {
            timer.cancel();
        }
        position = 0;
        startSlider();*/

    /* public void startSlider() {
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {

                public void run() {
                    // avoid exception:
                    // "Only the original thread that created a view hierarchy can touch its views"
                    runOnUiThread(new Runnable() {
                        public void run() {
                            imageSwitcher.setImageResource(gallery[position]);
                            position++;
                            if (position == gallery.length) {
                                position = 0;
                            }
                        }
                    });
                }

            }, 0, DURATION);
        }*/

    // Stops the slider when the Activity is going into the background
        /*@Override
        protected void onPause() {
            super.onPause();
            if (timer != null) {
                timer.cancel();
            }
        }*/

        /*@Override
        protected void onResume() {
        super.onResume();
        if (timer != null) {
            startSlider();
        }

    }*/


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public InteresesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InteresesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InteresesFragment newInstance(String param1, String param2) {
        InteresesFragment fragment = new InteresesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intereses, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}

package com.example.mattstart;

import android.content.ClipData;
import android.content.ClipDescription;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mattstart.databinding.FragmentDivEjercicio1Binding;
import com.example.mattstart.databinding.FragmentMultEjercicio1Binding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DivEjercicio1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DivEjercicio1 extends Fragment {
    private FragmentDivEjercicio1Binding binding;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    public View identificador;
    public int resultado=3,respuesta=0;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DivEjercicio1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SumaEjercicio1.
     */
    // TODO: Rename and change types and number of parameters
    public static DivEjercicio1 newInstance(String param1, String param2) {
        DivEjercicio1 fragment = new DivEjercicio1();
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
        binding = FragmentDivEjercicio1Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnResultado3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmar();
            }
        });
        binding.carro.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);
                return true;
            }
        });
        binding.carro2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);
                return true;
            }
        });
        binding.carro3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);
                return true;
            }
        });
        binding.carro4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);
                return true;
            }
        });
        binding.carro5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);
                return true;
            }
        });
        binding.carro6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);
                return true;
            }

        });
        binding.carro7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.carro20.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                dragempieza(v);

                return true;
            }
        });
        binding.resultado.setOnDragListener((v, e) -> {

            // Handles each of the expected events.
            switch (e.getAction()) {

                case DragEvent.ACTION_DRAG_STARTED:
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.drag);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                    // Determines if this View can accept the dragged data.
                    if (e.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {

                        // Returns true to indicate that the View can accept the dragged data.
                        return true;

                    }

                    // Returns false to indicate that, during the current drag and drop operation,
                    // this View will not receive events again until ACTION_DRAG_ENDED is sent.
                    return false;

                case DragEvent.ACTION_DRAG_ENTERED:

                    // Returns true; the value is ignored.
                    return true;

                case DragEvent.ACTION_DRAG_LOCATION:

                    // Ignore the event.
                    return true;

                case DragEvent.ACTION_DRAG_EXITED:

                    return true;

                case DragEvent.ACTION_DROP:
                    if(identificador.getParent().getParent()!=binding.resultado) {
                        respuesta++;
                    }
                    movercarro();
                    // Returns true. DragEvent.getResult() will return true.
                    return true;

                case DragEvent.ACTION_DRAG_ENDED:
                    MainActivity.player = MediaPlayer.create(getContext(), R.raw.drop);
                    MainActivity.player.setOnPreparedListener(MediaPlayer::start);
                    MainActivity.player.setOnCompletionListener(MediaPlayer::release);
                    identificador.setVisibility(View.VISIBLE);
                    // Returns true; the value is ignored.
                    return true;

                // An unknown action type was received.
                default:
                    Log.e("DragDrop Example", "Unknown action type received by View.OnDragListener.");
                    break;
            }

            return false;
        });
        binding.Layoutcarro.setOnDragListener((v, e) -> {

            // Handles each of the expected events.
            switch (e.getAction()) {

                case DragEvent.ACTION_DRAG_STARTED:

                    // Determines if this View can accept the dragged data.
                    if (e.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {

                        // Returns true to indicate that the View can accept the dragged data.
                        return true;

                    }

                    // Returns false to indicate that, during the current drag and drop operation,
                    // this View will not receive events again until ACTION_DRAG_ENDED is sent.
                    return false;

                case DragEvent.ACTION_DRAG_ENTERED:


                    // Returns true; the value is ignored.
                    return true;

                case DragEvent.ACTION_DRAG_LOCATION:

                    // Ignore the event.
                    return true;

                case DragEvent.ACTION_DRAG_EXITED:

                    return true;

                case DragEvent.ACTION_DROP:
                    if(identificador.getParent().getParent()!=binding.Layoutcarro) {
                        respuesta--;
                    }
                    movercarro2();
                    // Returns true. DragEvent.getResult() will return true.
                    return true;

                case DragEvent.ACTION_DRAG_ENDED:


                    // Invalidates the view to force a redraw.

                    return true;

                // An unknown action type was received.
                default:
                    Log.e("DragDrop Example", "Unknown action type received by View.OnDragListener.");
                    break;
            }

            return false;
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public boolean dragempieza(View v) {
        identificador=v;
        // Create a new ClipData.
        // This is done in two steps to provide clarity. The convenience method
        // ClipData.newPlainText() can create a plain text ClipData in one step.

        // Create a new ClipData.Item from the ImageView object's tag.
        ClipData.Item item = new ClipData.Item("hola");

        // Create a new ClipData using the tag as a label, the plain text MIME type, and
        // the already-created item. This creates a new ClipDescription object within the
        // ClipData and sets its MIME type to "text/plain".
        ClipData dragData = new ClipData(
                (CharSequence) "hola",
                new String[]{ClipDescription.MIMETYPE_TEXT_PLAIN},
                item);

        // Instantiate the drag shadow builder.
        View.DragShadowBuilder myShadow = new View.DragShadowBuilder(v);

        // Start the drag.
        v.startDragAndDrop(dragData,  // The data to be dragged
                myShadow,  // The drag shadow builder
                null,      // No need to use local data
                0          // Flags (not currently used, set to 0)
        );
        v.setVisibility(View.INVISIBLE);
        // Indicate that the long-click was handled.
        return true;
    }

    public void movercarro() {
        if(identificador.getParent()== binding.fila1) {
            if (binding.resultadofila1.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila1) {
                    binding.fila1.removeView(identificador);
                    binding.resultadofila1.addView(identificador);
                }
            } else if (binding.resultadofila1.getChildCount() == 5 && binding.resultadofila2.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila2) {
                    binding.fila1.removeView(identificador);
                    binding.resultadofila2.addView(identificador);
                }
            } else if (binding.resultadofila2.getChildCount() == 5 && binding.resultadofila3.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila3) {
                    binding.fila1.removeView(identificador);
                    binding.resultadofila3.addView(identificador);
                }
            } else if (binding.resultadofila3.getChildCount() == 5 && binding.resultadofila4.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila3) {
                    binding.fila1.removeView(identificador);
                    binding.resultadofila4.addView(identificador);
                }
            }
        }
        else if(identificador.getParent()== binding.fila2){
            if (binding.resultadofila1.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila1) {
                    binding.fila2.removeView(identificador);
                    binding.resultadofila1.addView(identificador);
                }
            } else if (binding.resultadofila1.getChildCount() == 5 && binding.resultadofila2.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila2) {
                    binding.fila2.removeView(identificador);
                    binding.resultadofila2.addView(identificador);
                }
            } else if (binding.resultadofila2.getChildCount() == 5 && binding.resultadofila3.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila3) {
                    binding.fila2.removeView(identificador);
                    binding.resultadofila3.addView(identificador);
                }
            } else if (binding.resultadofila3.getChildCount() == 5 && binding.resultadofila4.getChildCount() <= 4) {
                if (identificador.getParent() != binding.resultadofila3) {
                    binding.fila2.removeView(identificador);
                    binding.resultadofila4.addView(identificador);
                }
            }
        }
    }
    public void movercarro2() {
        if(identificador.getParent()== binding.resultadofila1) {
            if (binding.fila1.getChildCount() <= 9) {
                if (identificador.getParent() != binding.fila1) {
                    binding.resultadofila1.removeView(identificador);
                    binding.fila1.addView(identificador);
                }
            } else if (binding.fila1.getChildCount() == 10 && binding.resultadofila2.getChildCount() <= 20) {
                if (identificador.getParent() != binding.fila2) {
                    binding.resultadofila1.removeView(identificador);
                    binding.fila2.addView(identificador);
                }
            }
        }
        else if(identificador.getParent()== binding.resultadofila2) {
            if (binding.fila1.getChildCount() <= 9) {
                if (identificador.getParent() != binding.fila1) {
                    binding.resultadofila2.removeView(identificador);
                    binding.fila1.addView(identificador);
                }
            } else if (binding.fila1.getChildCount() == 10 && binding.resultadofila2.getChildCount() <= 20) {
                if (identificador.getParent() != binding.fila2) {
                    binding.resultadofila2.removeView(identificador);
                    binding.fila2.addView(identificador);
                }
            }
        }
        else if(identificador.getParent()== binding.resultadofila3) {
            if (binding.fila1.getChildCount() <= 9) {
                if (identificador.getParent() != binding.fila1) {
                    binding.resultadofila3.removeView(identificador);
                    binding.fila1.addView(identificador);
                }
            } else if (binding.fila1.getChildCount() == 10 && binding.resultadofila2.getChildCount() <= 20) {
                if (identificador.getParent() != binding.fila2) {
                    binding.resultadofila3.removeView(identificador);
                    binding.fila2.addView(identificador);
                }
            }
        }
        else if(identificador.getParent()== binding.resultadofila4) {
            if (binding.fila1.getChildCount() <= 9) {
                if (identificador.getParent() != binding.fila1) {
                    binding.resultadofila4.removeView(identificador);
                    binding.fila1.addView(identificador);
                }
            } else if (binding.fila1.getChildCount() == 10 && binding.resultadofila2.getChildCount() <= 20) {
                if (identificador.getParent() != binding.fila2) {
                    binding.resultadofila4.removeView(identificador);
                    binding.fila2.addView(identificador);
                }
            }
        }
    }
    public void confirmar(){
        if(resultado==respuesta){
            MainActivity.player = MediaPlayer.create(getContext(), R.raw.correcto);
            MainActivity.player.setOnPreparedListener(MediaPlayer::start);
            MainActivity.player.setOnCompletionListener(MediaPlayer::release);
            Toast.makeText(getContext(),"Correcto!!,bien hecho",Toast.LENGTH_LONG).show();
        }
        else{
            MainActivity.player = MediaPlayer.create(getContext(), R.raw.incorrecto);
            MainActivity.player.setOnPreparedListener(MediaPlayer::start);
            MainActivity.player.setOnCompletionListener(MediaPlayer::release);
            Toast.makeText(getContext(),"Incorrecto,no te preocupes sigue intentando",Toast.LENGTH_LONG).show();
        }
    }
}
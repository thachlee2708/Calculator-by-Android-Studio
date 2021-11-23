package com.lengocthach.thietkemanhinhmaytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_result;
    Button btn_0, btn_1,btn_2, btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,
            btn_cong,btn_tru,btn_nhan,btn_chia,btn_bang,btn_ac,btn_am_duong,btn_phan_tram,btn_cham;
    double so1=0;
    double so2=0;
    double solanchonpheptoan=0;
    double kq=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }
    @SuppressLint("ResourceAsColor")
    private void checkButton()
    {
        if(((ColorDrawable)btn_cong.getBackground()).getColor()==Color.YELLOW||
                ((ColorDrawable)btn_tru.getBackground()).getColor()==Color.YELLOW||
                ((ColorDrawable)btn_nhan.getBackground()).getColor()==Color.YELLOW||
                ((ColorDrawable)btn_chia.getBackground()).getColor()==Color.YELLOW)
        {
            btn_chia.setBackgroundColor(R.color.button);
            btn_cong.setBackgroundColor(R.color.button);
            btn_tru.setBackgroundColor(R.color.button);
            btn_nhan.setBackgroundColor(R.color.button);
            txt_result.setText("0");
        }
    }
    private void addEvents() {
        btn_0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                checkButton();
                if (Double.parseDouble(txt_result.getText().toString())!=0)
                {
                    txt_result.append(btn_0.getText().toString());
                        so1=Double.parseDouble(txt_result.getText().toString());

                }

            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_1.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_2.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_3.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_4.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_5.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_6.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_7.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_8.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkButton();
                if (txt_result.getText().toString().equals("0"))
                    txt_result.setText("");
                txt_result.append(btn_9.getText().toString());

                    so1=Double.parseDouble(txt_result.getText().toString());

            }
        });
        btn_cham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txt_result.getText().toString().contains("."))
                {
                    txt_result.append(btn_cham.getText().toString());
                }
            }
        });
        btn_cong.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "ResourceAsColor"})
            @Override
            public void onClick(View v) {
                btn_chia.setBackgroundColor(R.color.button);
                btn_cong.setBackgroundColor(Color.YELLOW);
                btn_tru.setBackgroundColor(R.color.button);
                btn_nhan.setBackgroundColor(R.color.button);
                if(!btn_cong.isSelected()&&!btn_tru.isSelected()
                &&!btn_nhan.isSelected()&&!btn_chia.isSelected())
                {
                    btn_tru.setSelected(false);
                    btn_nhan.setSelected(false);
                    btn_chia.setSelected(false);
                    btn_cong.setSelected(true);
                    kq=Double.parseDouble(txt_result.getText().toString());
                }
                else if(btn_nhan.isSelected()||
                        btn_cong.isSelected()||
                        btn_tru.isSelected()||
                        btn_chia.isSelected())
                {
                    if (true == btn_cong.isSelected()) {
                        kq=kq+so1;
                    } else if (true == btn_tru.isSelected()) {
                        kq=kq-so1;
                    } else if (true == btn_nhan.isSelected()) {
                        kq=kq*so1;
                    } else if (true == btn_chia.isSelected()) {
                        kq=kq/so1;
                    }
                    btn_tru.setSelected(false);
                    btn_nhan.setSelected(false);
                    btn_chia.setSelected(false);
                    btn_cong.setSelected(true);
                    txt_result.setText(kq+"");
                }
            }
        });
        btn_tru.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_chia.setBackgroundColor(R.color.button);
                btn_cong.setBackgroundColor(R.color.button);
                btn_tru.setBackgroundColor(Color.YELLOW);
                btn_nhan.setBackgroundColor(R.color.button);
                if(!btn_cong.isSelected()&&!btn_tru.isSelected()
                        &&!btn_nhan.isSelected()&&!btn_chia.isSelected())
                {
                    btn_tru.setSelected(true);
                    btn_nhan.setSelected(false);
                    btn_chia.setSelected(false);
                    btn_cong.setSelected(false);
                    kq=Double.parseDouble(txt_result.getText().toString());
                }
                else if(btn_nhan.isSelected()||
                        btn_cong.isSelected()||
                        btn_tru.isSelected()||
                        btn_chia.isSelected())
                {
                    if (true == btn_cong.isSelected()) {
                        kq=kq+so1;
                    } else if (true == btn_tru.isSelected()) {
                        kq=kq-so1;
                    } else if (true == btn_nhan.isSelected()) {
                        kq=kq*so1;
                    } else if (true == btn_chia.isSelected()) {
                        kq=kq/so1;
                    }
                    btn_tru.setSelected(true);
                    btn_nhan.setSelected(false);
                    btn_chia.setSelected(false);
                    btn_cong.setSelected(false);
                    txt_result.setText(kq+"");
                }

            }
        });
        btn_nhan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_chia.setBackgroundColor(R.color.button);
                btn_cong.setBackgroundColor(R.color.button);
                btn_tru.setBackgroundColor(R.color.button);
                btn_nhan.setBackgroundColor(Color.YELLOW);
                if(!btn_cong.isSelected()&&!btn_tru.isSelected()
                        &&!btn_nhan.isSelected()&&!btn_chia.isSelected())
                {
                    btn_tru.setSelected(false);
                    btn_nhan.setSelected(true);
                    btn_chia.setSelected(false);
                    btn_cong.setSelected(false);
                    kq=Double.parseDouble(txt_result.getText().toString());
                }
                else if(btn_nhan.isSelected()||
                        btn_cong.isSelected()||
                        btn_tru.isSelected()||
                        btn_chia.isSelected())
                {
                    if (true == btn_cong.isSelected()) {
                        kq=kq+so1;
                    } else if (true == btn_tru.isSelected()) {
                        kq=kq-so1;
                    } else if (true == btn_nhan.isSelected()) {
                        kq=kq*so1;
                    } else if (true == btn_chia.isSelected()) {
                        kq=kq/so1;
                    }
                    btn_tru.setSelected(false);
                    btn_nhan.setSelected(true);
                    btn_chia.setSelected(false);
                    btn_cong.setSelected(false);
                    txt_result.setText(kq+"");
                }
            }
        });
        btn_chia.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                btn_chia.setBackgroundColor(Color.YELLOW);
                btn_cong.setBackgroundColor(R.color.button);
                btn_tru.setBackgroundColor(R.color.button);
                btn_nhan.setBackgroundColor(R.color.button);
                if(!btn_cong.isSelected()&&!btn_tru.isSelected()
                        &&!btn_nhan.isSelected()&&!btn_chia.isSelected())
                {
                    btn_tru.setSelected(false);
                    btn_nhan.setSelected(false);
                    btn_chia.setSelected(true);
                    btn_cong.setSelected(false);
                    kq=Double.parseDouble(txt_result.getText().toString());
                }
                else if(btn_nhan.isSelected()||
                        btn_cong.isSelected()||
                        btn_tru.isSelected()||
                        btn_chia.isSelected())
                {
                    if (true == btn_cong.isSelected()) {
                        kq=kq+so1;
                    } else if (true == btn_tru.isSelected()) {
                        kq=kq-so1;
                    } else if (true == btn_nhan.isSelected()) {
                        kq=kq*so1;
                    } else if (true == btn_chia.isSelected()) {
                        kq=kq/so1;
                    }
                    btn_tru.setSelected(false);
                    btn_nhan.setSelected(false);
                    btn_chia.setSelected(true);
                    btn_cong.setSelected(false);
                    txt_result.setText(kq+"");
                }

            }
        });
        btn_bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_cong.isSelected())
                {
                    kq=so1+kq;
                    txt_result.setText(kq+"");
                    so1=0;
                }
                if (btn_tru.isSelected())
                {
                    kq=kq-so1;
                    txt_result.setText(kq+"");
                    so1=0;
                }
                if (btn_nhan.isSelected())
                {
                    kq=kq*so1;
                    txt_result.setText(kq+"");
                    so1=0;
                }
                if (btn_chia.isSelected())
                {
                    kq=kq/so1;
                    txt_result.setText(kq+"");
                    so1=0;
                }

            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                so1=0;
                so2=0;
                kq=0;
                txt_result.setText("0");
                solanchonpheptoan=0;
                btn_cong.setSelected(false);
                btn_tru.setSelected(false);
                btn_nhan.setSelected(false);
                btn_chia.setSelected(false);
            }
        });
        btn_am_duong.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String s=txt_result.getText().toString();

                if (Double.parseDouble(s)>0)
                {
                    txt_result.setText("-"+s);
                }
                if (Double.parseDouble(s)<0)
                {
                    txt_result.setText(Double.parseDouble(s)*(-1)+"");
                }
            }
        });
        btn_phan_tram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double phantram=Double.parseDouble(txt_result.getText().toString())/100;
                txt_result.setText(phantram+"");
            }
        });
    }

    private void addControls() {
        txt_result=findViewById(R.id.txt_result);
        btn_0=findViewById(R.id.btn_0);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        btn_cong=findViewById(R.id.btn_cong);
        btn_tru=findViewById(R.id.btn_tru);
        btn_nhan=findViewById(R.id.btn_nhan);
        btn_chia=findViewById(R.id.btn_chia);
        btn_bang=findViewById(R.id.btn_bang);
        btn_ac=findViewById(R.id.btn_ac);
        btn_am_duong=findViewById(R.id.btn_am_duong);
        btn_phan_tram=findViewById(R.id.btn_phantram);
        btn_cham=findViewById(R.id.btn_cham);
    }
}
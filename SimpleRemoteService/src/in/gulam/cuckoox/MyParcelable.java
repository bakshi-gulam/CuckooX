package in.gulam.cuckoox;

import android.os.Parcel;
import android.os.Parcelable;

public class MyParcelable implements Parcelable 
{
    private String mData;
    
    public String getData()
    {
    	return mData;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mData);
    }

    public static final Parcelable.Creator<MyParcelable> CREATOR
            = new Parcelable.Creator<MyParcelable>() {
        public MyParcelable createFromParcel(Parcel in) {
            return new MyParcelable(in);
        }

        public MyParcelable[] newArray(int size) {
            return new MyParcelable[size];
        }
        
    };
    
    private MyParcelable(Parcel in) {
        mData = in.readString();
        String.class.getClassLoader();
        
    }
    
    public MyParcelable(String in) {
        mData = in;
        
    }
}
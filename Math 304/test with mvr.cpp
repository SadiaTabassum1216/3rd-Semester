#include<bits/stdc++.h>
#include <iostream>
#define column 12
using namespace std;

int main()
{

    float coeffecient[column],user[column],ans;
    int i;

    freopen("value.txt", "r", stdin);
    for(i=0;i<column;i++){
            cin>>coeffecient[i];
            cout<<coeffecient[i]<<endl;
    }
    cout<<endl;

    freopen("userInput.txt", "r", stdin);
    for(i=0;i<column-1;i++){
        cin>>user[i];
        cout<<coeffecient[i]<<endl;
    }

   cout<<"The final equation is:"<<endl<<coeffecient[0];

    for(i=1;i<column-1;i++)
        cout<<" +("<<coeffecient[i]<<")("<<user[i]<<")";

    ans=coeffecient[0];
    for(i=1;i<column-1;i++)
        ans+=coeffecient[i]*user[i];

    cout<<"\n\nThe value is: "<<ans<<endl;
    if(ans>0.5)
        cout<<"\nAccepted."<<endl;
    else
        cout<<"\nRejected."<<endl;

}

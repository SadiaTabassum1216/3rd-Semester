#include<stdio.h>
#include<stdlib.h>
#include<math.h>

//#define f(X) (X)*(X)*(X)+4*(X)*(X)-10
#define EPS 10e-9

double f(double X){
    return X*X*X+4*X*X-10.0;
}
int main()
{
    int n=0;
    double a=1,b=2,x0;

    if(f(a)*f(b)>0){
        printf("No root exists.");
        exit(0);
    }
    while(1){
        x0=(a*f(b)-b*f(a))/(f(b)-f(a));
        n++;


    if(fabs(f(x0))<EPS){
    printf("Root: %.9lf\nIterantion: %d\n",x0,n);
    return 0;
    }

    if(f(a)*f(x0)<0)
        b=x0;
    else
        a=x0;
}
}

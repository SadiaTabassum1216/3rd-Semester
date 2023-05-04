#include<stdio.h>
#include<math.h>

int main()
{
int i=INFINITY,j,a=1;
//i=i-5;
printf("%d\n",i);
if(i==INFINITY)
{
    printf("done");
}
else
    printf("Nooooo");

    for(i=0;i<10;i++)
        for(j=0;j<10;j++)
            a++;
    printf("\nsa= %d",a);
}

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(){
    int T;
    scanf(" %d", &T);
    for (int k = 0; k < T; k++) {
        int contador = 0;

        int N;
        scanf(" %d", &N);

        int array[N];

        for(int i =0; i < N; i++) {
            int tmp;
            scanf(" %d", &tmp);
            array[i] = tmp;
        }

        for(int i = 1; i < N; i++){
            int menor = array[i];
            int j = i-1;
            while((j>=0) && (menor < array[j])){
                array[j+1] = array[j];
                j--;
                contador++;
            }
            array[j + 1] = menor;
        }
        printf("%d\n", contador);
    }
}
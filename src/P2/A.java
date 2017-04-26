/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;

/**
 *
 * @author Paulo H
 */
import P1.*;

public class A {

    private int pri = 1;
    protected int pro = 2;
    public int pub = 3;
    int pac = 4;

    private class X implements Ix {

        public A xpub = new A();
        private A xpri = new A();
        protected A xpro = new A();
        A xpac = new A();

        public void fx() {
            int soma1 = 0;
            int soma2 = 0;
            soma1 = pri + pro + pub + pac;
            soma2 = xpri.pri + xpro.pro + xpub.pub + xpac.pac;
            System.out.println("Soma1 = " + soma1);
            System.out.println("Soma2 = " + soma2);
        }
        
        public void ca12(){
        
        
            System.out.println("Teste CAWads");
        }

    }

    public Ix fa() {
        return new X();
    }

}

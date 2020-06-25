package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private int godinaStudiranja;
    private String datumRodjenja;
    private List<Integer> ocene = new ArrayList<>();

    public Student(String ime, String prezime, int brojIndeksa, int godinaStudiranja, String datumRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.godinaStudiranja = godinaStudiranja;
        this.datumRodjenja = datumRodjenja;

    }

    public Student() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public int getGodinaStudiranja() {
        return godinaStudiranja;
    }

    public void setGodinaStudiranja(int godinaStudiranja) {
        this.godinaStudiranja = godinaStudiranja;
    }

    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public List<Integer> getOcene() {
        return ocene;
    }

    public void setOcene(List<Integer> ocene) {
        this.ocene = ocene;
    }

    public boolean brucosIliNe() {
        return (this.godinaStudiranja == 1);
    }

    public double racunajProsek() {
        int sum = 0;
        for (int ocena : ocene) {
            sum += ocena;
        }
        return (double) sum / ocene.size();
    }

    public void dodajPolozeniIspit(int ocena) {
        if (ocene.size() < 32) {
            if (ocena < 5 && ocena > 10) {
                System.out.println("Ocena nije validna");
            } else {
                ocene.add(ocena);
            }
        } else {
            System.out.println("Lista sadrzi maksimalan broj ocena");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojIndeksa=" + brojIndeksa +
                ", godinaStudiranja=" + godinaStudiranja +
                ", datumRodjenja='" + datumRodjenja + '\'' +
                ", ocene=" + ocene +
                '}';
    }
}

package br.com.tinderevolution.TinderEvolution.dominio;

import java.time.LocalDate;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate data;
    private String bio;
    private Double latitude;
    private Double longitude;


    public Usuario(String nome, String email, String telefone, LocalDate data, String bio, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.data = data;
        this.bio = bio;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public int getId(){
        return id;
        }

    public void setId(final int id) {
        this.id = id;}

    public String getNome(){
            return nome;
        }
    public void setNome(String nome) {
        this.nome = nome; }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email; }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone; }

    public LocalDate getData(){
            return data;
        }
    public void setData(LocalDate data) {
        this.data = data;}

        public String getBio(){
            return bio;
        }
    public void setBio(String Bio) {
        this.bio = bio; }

        public double getLatitude(){
            return latitude;
        }
    public void setLatitude(double latitude) {
        this.latitude = latitude; }

        public double getLongitude(){
            return longitude;
        }
    public void setLongitude(double longitude) {
        this.longitude = longitude; }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data=" + data +
                ", bio='" + bio + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

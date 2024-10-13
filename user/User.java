package user;

class User implements UserInterface {
    private String name;
    private String email;
    private String username;

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name){
         this.name = name;
    }

    @Override
    public String getEmail(){
        return this.email;
    }

    @Override
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String getUserName(){
        return this.username;
    }

    @Override
    public void setUserName(String userName){
        this.username = userName;
    }
}
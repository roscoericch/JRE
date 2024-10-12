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
    public String getEmail(){
        return this.email;
    }

    @Override
    public String getUserName(){
        return this.username;
    }
}
package user;

class User implements UserInterface {
    public String name;
    public String email;
    public String username;

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
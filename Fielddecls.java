import java.util.LinkedList;
import java.util.List;

public class Fielddecls extends Token {
    private List<Fielddecl> fieldDeclarations;

    public Fielddecls() {
        fieldDeclarations = new LinkedList<>();
    }

    public Fielddecls(Fielddecl fd, Fielddecls fds) {
        this();
        fieldDeclarations.add(fd);
        fieldDeclarations.addAll(fds.fieldDeclarations);
    }

    public String toString(int t) {
        StringBuilder sb = new StringBuilder();
        for (Fielddecl fd : fieldDeclarations) {
            sb.append(fd.toString(t));
            sb.append("\n");
        }
        return sb.toString();
    }
}
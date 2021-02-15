package domain.attachment;

public class Poll {
    private int id;
    private int ownerId;
    private int created;
    private String question;
    private int votes;
    private boolean anonymous;
    private boolean multiple;
    private int end_date;
    private boolean closed;
    private boolean isBoard;
    private boolean canEdit;
    private boolean canVote;
    private boolean canReport;
    private boolean canShare;
    private int authorId;
    private Photo photo;
}

package sg.lifecare.cumii.data.server.data;

public class AcknowledgeData {

    private String EntityId;
    private String RuleEditEntityId;
    private String RuleId;

    public AcknowledgeData(String entityId, String editEntityId, String ruleId) {
        EntityId = entityId;
        RuleEditEntityId = editEntityId;
        RuleId = ruleId;
    }
}
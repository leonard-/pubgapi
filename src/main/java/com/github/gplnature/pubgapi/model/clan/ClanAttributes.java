package com.github.gplnature.pubgapi.model.clan;

public class ClanAttributes {

    private String clanName;

    private String clanTag;

    private Integer clanLevel;

    private Integer clanMemberCount;

    public ClanAttributes() {
    }

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    public String getClanTag() {
        return clanTag;
    }

    public void setClanTag(String clanTag) {
        this.clanTag = clanTag;
    }

    public Integer getClanMemberCount() {
        return clanMemberCount;
    }

    public void setClanMemberCount(Integer clanMemberCount) {
        this.clanMemberCount = clanMemberCount;
    }

    public Integer getClanLevel() {
        return clanLevel;
    }

    public void setClanLevel(Integer clanLevel) {
        this.clanLevel = clanLevel;
    }
}
(ns net.minecraft.scoreboard.ScorePlayerTeam
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard ScorePlayerTeam]))

(defn ->score-player-team
  "Constructor.

  the-scoreboard-in - `net.minecraft.scoreboard.Scoreboard`
  name - `java.lang.String`"
  (^ScorePlayerTeam [^net.minecraft.scoreboard.Scoreboard the-scoreboard-in ^java.lang.String name]
    (new ScorePlayerTeam the-scoreboard-in name)))

(defn *format-player-name
  "team-in - `net.minecraft.scoreboard.Team`
  string - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^net.minecraft.scoreboard.Team team-in ^java.lang.String string]
    (ScorePlayerTeam/formatPlayerName team-in string)))

(defn set-name-suffix
  "suffix - `java.lang.String`"
  ([^ScorePlayerTeam this ^java.lang.String suffix]
    (-> this (.setNameSuffix suffix))))

(defn get-name-tag-visibility
  "returns: `net.minecraft.scoreboard.Team$EnumVisible`"
  (^net.minecraft.scoreboard.Team$EnumVisible [^ScorePlayerTeam this]
    (-> this (.getNameTagVisibility))))

(defn set-name-prefix
  "prefix - `java.lang.String`"
  ([^ScorePlayerTeam this ^java.lang.String prefix]
    (-> this (.setNamePrefix prefix))))

(defn set-death-message-visibility
  "visibility - `net.minecraft.scoreboard.Team$EnumVisible`"
  ([^ScorePlayerTeam this ^net.minecraft.scoreboard.Team$EnumVisible visibility]
    (-> this (.setDeathMessageVisibility visibility))))

(defn set-see-friendly-invisibles-enabled
  "friendly-invisibles - `boolean`"
  ([^ScorePlayerTeam this ^Boolean friendly-invisibles]
    (-> this (.setSeeFriendlyInvisiblesEnabled friendly-invisibles))))

(defn set-name-tag-visibility
  "visibility - `net.minecraft.scoreboard.Team$EnumVisible`"
  ([^ScorePlayerTeam this ^net.minecraft.scoreboard.Team$EnumVisible visibility]
    (-> this (.setNameTagVisibility visibility))))

(defn get-allow-friendly-fire?
  "returns: `boolean`"
  (^Boolean [^ScorePlayerTeam this]
    (-> this (.getAllowFriendlyFire))))

(defn set-friendly-flags
  "flags - `int`"
  ([^ScorePlayerTeam this ^Integer flags]
    (-> this (.setFriendlyFlags flags))))

(defn format-string
  "input - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ScorePlayerTeam this ^java.lang.String input]
    (-> this (.formatString input))))

(defn set-team-name
  "name - `java.lang.String`"
  ([^ScorePlayerTeam this ^java.lang.String name]
    (-> this (.setTeamName name))))

(defn get-color-suffix
  "returns: `java.lang.String`"
  (^java.lang.String [^ScorePlayerTeam this]
    (-> this (.getColorSuffix))))

(defn get-team-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ScorePlayerTeam this]
    (-> this (.getTeamName))))

(defn get-friendly-flags
  "returns: `int`"
  (^Integer [^ScorePlayerTeam this]
    (-> this (.getFriendlyFlags))))

(defn get-color-prefix
  "returns: `java.lang.String`"
  (^java.lang.String [^ScorePlayerTeam this]
    (-> this (.getColorPrefix))))

(defn set-chat-format
  "format - `net.minecraft.util.text.TextFormatting`"
  ([^ScorePlayerTeam this ^net.minecraft.util.text.TextFormatting format]
    (-> this (.setChatFormat format))))

(defn get-see-friendly-invisibles-enabled?
  "returns: `boolean`"
  (^Boolean [^ScorePlayerTeam this]
    (-> this (.getSeeFriendlyInvisiblesEnabled))))

(defn get-registered-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ScorePlayerTeam this]
    (-> this (.getRegisteredName))))

(defn get-chat-format
  "returns: `net.minecraft.util.text.TextFormatting`"
  (^net.minecraft.util.text.TextFormatting [^ScorePlayerTeam this]
    (-> this (.getChatFormat))))

(defn set-allow-friendly-fire
  "friendly-fire - `boolean`"
  ([^ScorePlayerTeam this ^Boolean friendly-fire]
    (-> this (.setAllowFriendlyFire friendly-fire))))

(defn get-collision-rule
  "returns: `net.minecraft.scoreboard.Team$CollisionRule`"
  (^net.minecraft.scoreboard.Team$CollisionRule [^ScorePlayerTeam this]
    (-> this (.getCollisionRule))))

(defn get-death-message-visibility
  "returns: `net.minecraft.scoreboard.Team$EnumVisible`"
  (^net.minecraft.scoreboard.Team$EnumVisible [^ScorePlayerTeam this]
    (-> this (.getDeathMessageVisibility))))

(defn get-membership-collection
  "returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^ScorePlayerTeam this]
    (-> this (.getMembershipCollection))))

(defn set-collision-rule
  "rule - `net.minecraft.scoreboard.Team$CollisionRule`"
  ([^ScorePlayerTeam this ^net.minecraft.scoreboard.Team$CollisionRule rule]
    (-> this (.setCollisionRule rule))))


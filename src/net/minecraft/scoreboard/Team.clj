(ns net.minecraft.scoreboard.Team
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard Team]))

(defn ->team
  "Constructor."
  (^Team []
    (new Team )))

(defn same-team?
  "other - `net.minecraft.scoreboard.Team`

  returns: `boolean`"
  (^Boolean [^Team this ^net.minecraft.scoreboard.Team other]
    (-> this (.isSameTeam other))))

(defn get-name-tag-visibility
  "returns: `net.minecraft.scoreboard.Team$EnumVisible`"
  (^net.minecraft.scoreboard.Team$EnumVisible [^Team this]
    (-> this (.getNameTagVisibility))))

(defn get-allow-friendly-fire?
  "returns: `boolean`"
  (^Boolean [^Team this]
    (-> this (.getAllowFriendlyFire))))

(defn format-string
  "input - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^Team this ^java.lang.String input]
    (-> this (.formatString input))))

(defn get-see-friendly-invisibles-enabled?
  "returns: `boolean`"
  (^Boolean [^Team this]
    (-> this (.getSeeFriendlyInvisiblesEnabled))))

(defn get-registered-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Team this]
    (-> this (.getRegisteredName))))

(defn get-chat-format
  "returns: `net.minecraft.util.text.TextFormatting`"
  (^net.minecraft.util.text.TextFormatting [^Team this]
    (-> this (.getChatFormat))))

(defn get-collision-rule
  "returns: `net.minecraft.scoreboard.Team$CollisionRule`"
  (^net.minecraft.scoreboard.Team$CollisionRule [^Team this]
    (-> this (.getCollisionRule))))

(defn get-death-message-visibility
  "returns: `net.minecraft.scoreboard.Team$EnumVisible`"
  (^net.minecraft.scoreboard.Team$EnumVisible [^Team this]
    (-> this (.getDeathMessageVisibility))))

(defn get-membership-collection
  "returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Team this]
    (-> this (.getMembershipCollection))))


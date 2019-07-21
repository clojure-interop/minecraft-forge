(ns net.minecraft.scoreboard.Team$CollisionRule
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard Team$CollisionRule]))

(def ALWAYS
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$CollisionRule"
  Team$CollisionRule/ALWAYS)

(def NEVER
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$CollisionRule"
  Team$CollisionRule/NEVER)

(def HIDE_FOR_OTHER_TEAMS
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$CollisionRule"
  Team$CollisionRule/HIDE_FOR_OTHER_TEAMS)

(def HIDE_FOR_OWN_TEAM
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$CollisionRule"
  Team$CollisionRule/HIDE_FOR_OWN_TEAM)

(defn name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^Team$CollisionRule this]
    (-> this .-name)))

(defn id
  "Instance Constant.

  type: int"
  (^Integer [^Team$CollisionRule this]
    (-> this .-id)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Team.CollisionRule c : Team.CollisionRule.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.scoreboard.Team$CollisionRule[]`"
  ([]
    (Team$CollisionRule/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.scoreboard.Team$CollisionRule`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.scoreboard.Team$CollisionRule [^java.lang.String name]
    (Team$CollisionRule/valueOf name)))

(defn *get-names
  "returns: `java.lang.String[]`"
  ([]
    (Team$CollisionRule/getNames )))

(defn *get-by-name
  "name-in - `java.lang.String`

  returns: `net.minecraft.scoreboard.Team$CollisionRule`"
  (^net.minecraft.scoreboard.Team$CollisionRule [^java.lang.String name-in]
    (Team$CollisionRule/getByName name-in)))


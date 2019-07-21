(ns net.minecraft.scoreboard.Team$EnumVisible
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard Team$EnumVisible]))

(def ALWAYS
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$EnumVisible"
  Team$EnumVisible/ALWAYS)

(def NEVER
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$EnumVisible"
  Team$EnumVisible/NEVER)

(def HIDE_FOR_OTHER_TEAMS
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$EnumVisible"
  Team$EnumVisible/HIDE_FOR_OTHER_TEAMS)

(def HIDE_FOR_OWN_TEAM
  "Enum Constant.

  type: net.minecraft.scoreboard.Team$EnumVisible"
  Team$EnumVisible/HIDE_FOR_OWN_TEAM)

(defn internal-name
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^Team$EnumVisible this]
    (-> this .-internalName)))

(defn id
  "Instance Constant.

  type: int"
  (^Integer [^Team$EnumVisible this]
    (-> this .-id)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Team.EnumVisible c : Team.EnumVisible.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.scoreboard.Team$EnumVisible[]`"
  ([]
    (Team$EnumVisible/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.scoreboard.Team$EnumVisible`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.scoreboard.Team$EnumVisible [^java.lang.String name]
    (Team$EnumVisible/valueOf name)))

(defn *get-names
  "returns: `java.lang.String[]`"
  ([]
    (Team$EnumVisible/getNames )))

(defn *get-by-name
  "name-in - `java.lang.String`

  returns: `net.minecraft.scoreboard.Team$EnumVisible`"
  (^net.minecraft.scoreboard.Team$EnumVisible [^java.lang.String name-in]
    (Team$EnumVisible/getByName name-in)))


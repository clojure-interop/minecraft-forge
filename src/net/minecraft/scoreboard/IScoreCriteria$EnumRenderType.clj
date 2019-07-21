(ns net.minecraft.scoreboard.IScoreCriteria$EnumRenderType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.scoreboard IScoreCriteria$EnumRenderType]))

(def INTEGER
  "Enum Constant.

  type: net.minecraft.scoreboard.IScoreCriteria$EnumRenderType"
  IScoreCriteria$EnumRenderType/INTEGER)

(def HEARTS
  "Enum Constant.

  type: net.minecraft.scoreboard.IScoreCriteria$EnumRenderType"
  IScoreCriteria$EnumRenderType/HEARTS)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (IScoreCriteria.EnumRenderType c : IScoreCriteria.EnumRenderType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType[]`"
  ([]
    (IScoreCriteria$EnumRenderType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^java.lang.String name]
    (IScoreCriteria$EnumRenderType/valueOf name)))

(defn *get-by-name
  "name - `java.lang.String`

  returns: `net.minecraft.scoreboard.IScoreCriteria$EnumRenderType`"
  (^net.minecraft.scoreboard.IScoreCriteria$EnumRenderType [^java.lang.String name]
    (IScoreCriteria$EnumRenderType/getByName name)))

(defn get-render-type
  "returns: `java.lang.String`"
  (^java.lang.String [^IScoreCriteria$EnumRenderType this]
    (-> this (.getRenderType))))


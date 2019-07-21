(ns net.minecraft.util.text.event.HoverEvent$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text.event HoverEvent$Action]))

(def SHOW_TEXT
  "Enum Constant.

  type: net.minecraft.util.text.event.HoverEvent$Action"
  HoverEvent$Action/SHOW_TEXT)

(def SHOW_ACHIEVEMENT
  "Enum Constant.

  type: net.minecraft.util.text.event.HoverEvent$Action"
  HoverEvent$Action/SHOW_ACHIEVEMENT)

(def SHOW_ITEM
  "Enum Constant.

  type: net.minecraft.util.text.event.HoverEvent$Action"
  HoverEvent$Action/SHOW_ITEM)

(def SHOW_ENTITY
  "Enum Constant.

  type: net.minecraft.util.text.event.HoverEvent$Action"
  HoverEvent$Action/SHOW_ENTITY)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (HoverEvent.Action c : HoverEvent.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.text.event.HoverEvent$Action[]`"
  ([]
    (HoverEvent$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.text.event.HoverEvent$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.text.event.HoverEvent$Action [^java.lang.String name]
    (HoverEvent$Action/valueOf name)))

(defn *get-value-by-canonical-name
  "canonical-name-in - `java.lang.String`

  returns: `net.minecraft.util.text.event.HoverEvent$Action`"
  (^net.minecraft.util.text.event.HoverEvent$Action [^java.lang.String canonical-name-in]
    (HoverEvent$Action/getValueByCanonicalName canonical-name-in)))

(defn should-allow-in-chat?
  "returns: `boolean`"
  (^Boolean [^HoverEvent$Action this]
    (-> this (.shouldAllowInChat))))

(defn get-canonical-name
  "returns: `java.lang.String`"
  (^java.lang.String [^HoverEvent$Action this]
    (-> this (.getCanonicalName))))


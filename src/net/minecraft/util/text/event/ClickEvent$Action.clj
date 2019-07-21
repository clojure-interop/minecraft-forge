(ns net.minecraft.util.text.event.ClickEvent$Action
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text.event ClickEvent$Action]))

(def OPEN_URL
  "Enum Constant.

  type: net.minecraft.util.text.event.ClickEvent$Action"
  ClickEvent$Action/OPEN_URL)

(def OPEN_FILE
  "Enum Constant.

  type: net.minecraft.util.text.event.ClickEvent$Action"
  ClickEvent$Action/OPEN_FILE)

(def RUN_COMMAND
  "Enum Constant.

  type: net.minecraft.util.text.event.ClickEvent$Action"
  ClickEvent$Action/RUN_COMMAND)

(def SUGGEST_COMMAND
  "Enum Constant.

  type: net.minecraft.util.text.event.ClickEvent$Action"
  ClickEvent$Action/SUGGEST_COMMAND)

(def CHANGE_PAGE
  "Enum Constant.

  type: net.minecraft.util.text.event.ClickEvent$Action"
  ClickEvent$Action/CHANGE_PAGE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ClickEvent.Action c : ClickEvent.Action.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.text.event.ClickEvent$Action[]`"
  ([]
    (ClickEvent$Action/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.text.event.ClickEvent$Action`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.text.event.ClickEvent$Action [^java.lang.String name]
    (ClickEvent$Action/valueOf name)))

(defn *get-value-by-canonical-name
  "canonical-name-in - `java.lang.String`

  returns: `net.minecraft.util.text.event.ClickEvent$Action`"
  (^net.minecraft.util.text.event.ClickEvent$Action [^java.lang.String canonical-name-in]
    (ClickEvent$Action/getValueByCanonicalName canonical-name-in)))

(defn should-allow-in-chat?
  "returns: `boolean`"
  (^Boolean [^ClickEvent$Action this]
    (-> this (.shouldAllowInChat))))

(defn get-canonical-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ClickEvent$Action this]
    (-> this (.getCanonicalName))))


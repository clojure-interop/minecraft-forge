(ns net.minecraftforge.client.settings.KeyModifier
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.settings KeyModifier]))

(def CONTROL
  "Enum Constant.

  type: net.minecraftforge.client.settings.KeyModifier"
  KeyModifier/CONTROL)

(def SHIFT
  "Enum Constant.

  type: net.minecraftforge.client.settings.KeyModifier"
  KeyModifier/SHIFT)

(def ALT
  "Enum Constant.

  type: net.minecraftforge.client.settings.KeyModifier"
  KeyModifier/ALT)

(def NONE
  "Enum Constant.

  type: net.minecraftforge.client.settings.KeyModifier"
  KeyModifier/NONE)

(def *-modifier-values
  "Static Constant.

  type: net.minecraftforge.client.settings.KeyModifier[]"
  KeyModifier/MODIFIER_VALUES)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (KeyModifier c : KeyModifier.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.settings.KeyModifier[]`"
  ([]
    (KeyModifier/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.settings.KeyModifier`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.settings.KeyModifier [^java.lang.String name]
    (KeyModifier/valueOf name)))

(defn *get-active-modifier
  "returns: `net.minecraftforge.client.settings.KeyModifier`"
  (^net.minecraftforge.client.settings.KeyModifier []
    (KeyModifier/getActiveModifier )))

(defn *key-code-modifier?
  "key-code - `int`

  returns: `boolean`"
  (^Boolean [^Integer key-code]
    (KeyModifier/isKeyCodeModifier key-code)))

(defn *value-from-string
  "string-value - `java.lang.String`

  returns: `net.minecraftforge.client.settings.KeyModifier`"
  (^net.minecraftforge.client.settings.KeyModifier [^java.lang.String string-value]
    (KeyModifier/valueFromString string-value)))

(defn matches
  "key-code - `int`

  returns: `boolean`"
  (^Boolean [^KeyModifier this ^Integer key-code]
    (-> this (.matches key-code))))

(defn active?
  "conflict-context - `net.minecraftforge.client.settings.IKeyConflictContext`

  returns: `boolean`"
  (^Boolean [^KeyModifier this ^net.minecraftforge.client.settings.IKeyConflictContext conflict-context]
    (-> this (.isActive conflict-context)))
  (^Boolean [^KeyModifier this]
    (-> this (.isActive))))

(defn get-localized-combo-name
  "key-code - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^KeyModifier this ^Integer key-code]
    (-> this (.getLocalizedComboName key-code))))


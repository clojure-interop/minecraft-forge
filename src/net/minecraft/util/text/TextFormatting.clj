(ns net.minecraft.util.text.TextFormatting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextFormatting]))

(def BLACK
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/BLACK)

(def DARK_BLUE
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/DARK_BLUE)

(def DARK_GREEN
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/DARK_GREEN)

(def DARK_AQUA
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/DARK_AQUA)

(def DARK_RED
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/DARK_RED)

(def DARK_PURPLE
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/DARK_PURPLE)

(def GOLD
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/GOLD)

(def GRAY
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/GRAY)

(def DARK_GRAY
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/DARK_GRAY)

(def BLUE
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/BLUE)

(def GREEN
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/GREEN)

(def AQUA
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/AQUA)

(def RED
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/RED)

(def LIGHT_PURPLE
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/LIGHT_PURPLE)

(def YELLOW
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/YELLOW)

(def WHITE
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/WHITE)

(def OBFUSCATED
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/OBFUSCATED)

(def BOLD
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/BOLD)

(def STRIKETHROUGH
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/STRIKETHROUGH)

(def UNDERLINE
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/UNDERLINE)

(def ITALIC
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/ITALIC)

(def RESET
  "Enum Constant.

  type: net.minecraft.util.text.TextFormatting"
  TextFormatting/RESET)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TextFormatting c : TextFormatting.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.text.TextFormatting[]`"
  ([]
    (TextFormatting/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.text.TextFormatting`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.text.TextFormatting [^java.lang.String name]
    (TextFormatting/valueOf name)))

(defn *get-text-without-formatting-codes
  "text - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String text]
    (TextFormatting/getTextWithoutFormattingCodes text)))

(defn *get-value-by-name
  "friendly-name - `java.lang.String`

  returns: `net.minecraft.util.text.TextFormatting`"
  (^net.minecraft.util.text.TextFormatting [^java.lang.String friendly-name]
    (TextFormatting/getValueByName friendly-name)))

(defn *from-color-index
  "index - `int`

  returns: `net.minecraft.util.text.TextFormatting`"
  (^net.minecraft.util.text.TextFormatting [^Integer index]
    (TextFormatting/fromColorIndex index)))

(defn *get-valid-values
  "p-96296-0 - `boolean`
  p-96296-1 - `boolean`

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^Boolean p-96296-0 ^Boolean p-96296-1]
    (TextFormatting/getValidValues p-96296-0 p-96296-1)))

(defn get-color-index
  "returns: `int`"
  (^Integer [^TextFormatting this]
    (-> this (.getColorIndex))))

(defn fancy-styling?
  "returns: `boolean`"
  (^Boolean [^TextFormatting this]
    (-> this (.isFancyStyling))))

(defn color?
  "returns: `boolean`"
  (^Boolean [^TextFormatting this]
    (-> this (.isColor))))

(defn get-friendly-name
  "returns: `java.lang.String`"
  (^java.lang.String [^TextFormatting this]
    (-> this (.getFriendlyName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TextFormatting this]
    (-> this (.toString))))


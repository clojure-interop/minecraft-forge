(ns net.minecraft.util.ChatAllowedCharacters
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util ChatAllowedCharacters]))

(defn ->chat-allowed-characters
  "Constructor."
  (^ChatAllowedCharacters []
    (new ChatAllowedCharacters )))

(def *-netty-leak-detection
  "Static Constant.

  type: io.netty.util.ResourceLeakDetector.Level"
  ChatAllowedCharacters/NETTY_LEAK_DETECTION)

(def *-illegal-structure-characters
  "Static Constant.

  type: char[]"
  ChatAllowedCharacters/ILLEGAL_STRUCTURE_CHARACTERS)

(def *-illegal-file-characters
  "Static Constant.

  type: char[]"
  ChatAllowedCharacters/ILLEGAL_FILE_CHARACTERS)

(defn *allowed-character?
  "character - `char`

  returns: `boolean`"
  (^Boolean [^Character character]
    (ChatAllowedCharacters/isAllowedCharacter character)))

(defn *filter-allowed-characters
  "input - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (ChatAllowedCharacters/filterAllowedCharacters input)))


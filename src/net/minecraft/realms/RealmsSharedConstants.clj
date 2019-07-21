(ns net.minecraft.realms.RealmsSharedConstants
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsSharedConstants]))

(defn ->realms-shared-constants
  "Constructor."
  (^RealmsSharedConstants []
    (new RealmsSharedConstants )))

(defn *-network-protocol-version
  "Static Field.

  type: int"
  []
  RealmsSharedConstants/NETWORK_PROTOCOL_VERSION)

(defn *-ticks-per-second
  "Static Field.

  type: int"
  []
  RealmsSharedConstants/TICKS_PER_SECOND)

(defn *-version-string
  "Static Field.

  type: java.lang.String"
  []
  RealmsSharedConstants/VERSION_STRING)

(defn *-illegal-file-characters
  "Static Field.

  type: char[]"
  []
  RealmsSharedConstants/ILLEGAL_FILE_CHARACTERS)


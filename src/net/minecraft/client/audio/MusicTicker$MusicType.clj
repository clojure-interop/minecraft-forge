(ns net.minecraft.client.audio.MusicTicker$MusicType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio MusicTicker$MusicType]))

(def MENU
  "Enum Constant.

  type: net.minecraft.client.audio.MusicTicker$MusicType"
  MusicTicker$MusicType/MENU)

(def GAME
  "Enum Constant.

  type: net.minecraft.client.audio.MusicTicker$MusicType"
  MusicTicker$MusicType/GAME)

(def CREATIVE
  "Enum Constant.

  type: net.minecraft.client.audio.MusicTicker$MusicType"
  MusicTicker$MusicType/CREATIVE)

(def CREDITS
  "Enum Constant.

  type: net.minecraft.client.audio.MusicTicker$MusicType"
  MusicTicker$MusicType/CREDITS)

(def NETHER
  "Enum Constant.

  type: net.minecraft.client.audio.MusicTicker$MusicType"
  MusicTicker$MusicType/NETHER)

(def END_BOSS
  "Enum Constant.

  type: net.minecraft.client.audio.MusicTicker$MusicType"
  MusicTicker$MusicType/END_BOSS)

(def END
  "Enum Constant.

  type: net.minecraft.client.audio.MusicTicker$MusicType"
  MusicTicker$MusicType/END)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MusicTicker.MusicType c : MusicTicker.MusicType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.audio.MusicTicker$MusicType[]`"
  ([]
    (MusicTicker$MusicType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.audio.MusicTicker$MusicType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.audio.MusicTicker$MusicType [^java.lang.String name]
    (MusicTicker$MusicType/valueOf name)))

(defn get-music-location
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^MusicTicker$MusicType this]
    (-> this (.getMusicLocation))))

(defn get-min-delay
  "returns: `int`"
  (^Integer [^MusicTicker$MusicType this]
    (-> this (.getMinDelay))))

(defn get-max-delay
  "returns: `int`"
  (^Integer [^MusicTicker$MusicType this]
    (-> this (.getMaxDelay))))


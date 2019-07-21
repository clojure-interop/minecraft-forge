(ns net.minecraft.world.GameType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world GameType]))

(def NOT_SET
  "Enum Constant.

  type: net.minecraft.world.GameType"
  GameType/NOT_SET)

(def SURVIVAL
  "Enum Constant.

  type: net.minecraft.world.GameType"
  GameType/SURVIVAL)

(def CREATIVE
  "Enum Constant.

  type: net.minecraft.world.GameType"
  GameType/CREATIVE)

(def ADVENTURE
  "Enum Constant.

  type: net.minecraft.world.GameType"
  GameType/ADVENTURE)

(def SPECTATOR
  "Enum Constant.

  type: net.minecraft.world.GameType"
  GameType/SPECTATOR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GameType c : GameType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.GameType[]`"
  ([]
    (GameType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.GameType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.GameType [^java.lang.String name]
    (GameType/valueOf name)))

(defn *get-by-id
  "id-in - `int`

  returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^Integer id-in]
    (GameType/getByID id-in)))

(defn *parse-game-type-with-default
  "target-id - `int`
  fallback - `net.minecraft.world.GameType`

  returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^Integer target-id ^net.minecraft.world.GameType fallback]
    (GameType/parseGameTypeWithDefault target-id fallback)))

(defn *get-by-name
  "gamemode-name - `java.lang.String`

  returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^java.lang.String gamemode-name]
    (GameType/getByName gamemode-name)))

(defn get-id
  "returns: `int`"
  (^Integer [^GameType this]
    (-> this (.getID))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^GameType this]
    (-> this (.getName))))

(defn configure-player-capabilities
  "capabilities - `net.minecraft.entity.player.PlayerCapabilities`"
  ([^GameType this ^net.minecraft.entity.player.PlayerCapabilities capabilities]
    (-> this (.configurePlayerCapabilities capabilities))))

(defn adventure?
  "returns: `boolean`"
  (^Boolean [^GameType this]
    (-> this (.isAdventure))))

(defn creative?
  "returns: `boolean`"
  (^Boolean [^GameType this]
    (-> this (.isCreative))))

(defn survival-or-adventure?
  "returns: `boolean`"
  (^Boolean [^GameType this]
    (-> this (.isSurvivalOrAdventure))))


(ns net.minecraft.world.end.DragonSpawnManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.end DragonSpawnManager]))

(def START
  "Enum Constant.

  type: net.minecraft.world.end.DragonSpawnManager"
  DragonSpawnManager/START)

(def PREPARING_TO_SUMMON_PILLARS
  "Enum Constant.

  type: net.minecraft.world.end.DragonSpawnManager"
  DragonSpawnManager/PREPARING_TO_SUMMON_PILLARS)

(def SUMMONING_PILLARS
  "Enum Constant.

  type: net.minecraft.world.end.DragonSpawnManager"
  DragonSpawnManager/SUMMONING_PILLARS)

(def SUMMONING_DRAGON
  "Enum Constant.

  type: net.minecraft.world.end.DragonSpawnManager"
  DragonSpawnManager/SUMMONING_DRAGON)

(def END
  "Enum Constant.

  type: net.minecraft.world.end.DragonSpawnManager"
  DragonSpawnManager/END)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (DragonSpawnManager c : DragonSpawnManager.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.end.DragonSpawnManager[]`"
  ([]
    (DragonSpawnManager/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.end.DragonSpawnManager`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.end.DragonSpawnManager [^java.lang.String name]
    (DragonSpawnManager/valueOf name)))

(defn process
  "world-in - `net.minecraft.world.WorldServer`
  manager - `net.minecraft.world.end.DragonFightManager`
  crystals - `java.util.List`
  ticks - `int`
  pos - `net.minecraft.util.math.BlockPos`"
  ([^DragonSpawnManager this ^net.minecraft.world.WorldServer world-in ^net.minecraft.world.end.DragonFightManager manager ^java.util.List crystals ^Integer ticks ^net.minecraft.util.math.BlockPos pos]
    (-> this (.process world-in manager crystals ticks pos))))


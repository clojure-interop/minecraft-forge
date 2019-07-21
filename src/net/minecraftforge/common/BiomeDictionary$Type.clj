(ns net.minecraftforge.common.BiomeDictionary$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common BiomeDictionary$Type]))

(def *-hot
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/HOT)

(def *-cold
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/COLD)

(def *-sparse
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/SPARSE)

(def *-dense
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/DENSE)

(def *-wet
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/WET)

(def *-dry
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/DRY)

(def *-savanna
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/SAVANNA)

(def *-coniferous
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/CONIFEROUS)

(def *-jungle
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/JUNGLE)

(def *-spooky
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/SPOOKY)

(def *-dead
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/DEAD)

(def *-lush
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/LUSH)

(def *-nether
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/NETHER)

(def *-end
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/END)

(def *-mushroom
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/MUSHROOM)

(def *-magical
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/MAGICAL)

(def *-rare
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/RARE)

(def *-ocean
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/OCEAN)

(def *-river
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/RIVER)

(def *-water
  "Static Constant.

  A general tag for all water-based biomes. Shown as present if OCEAN or RIVER are.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/WATER)

(def *-mesa
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/MESA)

(def *-forest
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/FOREST)

(def *-plains
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/PLAINS)

(def *-mountain
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/MOUNTAIN)

(def *-hills
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/HILLS)

(def *-swamp
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/SWAMP)

(def *-sandy
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/SANDY)

(def *-snowy
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/SNOWY)

(def *-wasteland
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/WASTELAND)

(def *-beach
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/BEACH)

(def *-void
  "Static Constant.

  type: net.minecraftforge.common.BiomeDictionary$Type"
  BiomeDictionary$Type/VOID)

(defn *get-type
  "Retrieves a Type instance by name,
   if one does not exist already it creates one.
   This can be used as intermediate measure for modders to
   add their own Biome types.

   There are no naming conventions besides:
   Must be all upper case (enforced by name.toUpper())
   No Special characters. {Unenforced, just don't be a pain, if it becomes a issue I WILL
   make this RTE with no worry about backwards compatibility}

   Note: For performance sake, the return value of this function SHOULD be cached.
   Two calls with the same name SHOULD return the same value.

  name - The name of this Type - `java.lang.String`
  sub-types - `net.minecraftforge.common.BiomeDictionary$Type`

  returns: An instance of Type for this name. - `net.minecraftforge.common.BiomeDictionary$Type`"
  (^net.minecraftforge.common.BiomeDictionary$Type [^java.lang.String name ^net.minecraftforge.common.BiomeDictionary$Type sub-types]
    (BiomeDictionary$Type/getType name sub-types)))

(defn get-name
  "Gets the name for this type.

  returns: `java.lang.String`"
  (^java.lang.String [^BiomeDictionary$Type this]
    (-> this (.getName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BiomeDictionary$Type this]
    (-> this (.toString))))


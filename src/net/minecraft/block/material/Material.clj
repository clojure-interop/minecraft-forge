(ns net.minecraft.block.material.Material
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.material Material]))

(defn ->material
  "Constructor.

  color - `net.minecraft.block.material.MapColor`"
  (^Material [^net.minecraft.block.material.MapColor color]
    (new Material color)))

(def *-air
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/AIR)

(def *-grass
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/GRASS)

(def *-ground
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/GROUND)

(def *-wood
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/WOOD)

(def *-rock
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/ROCK)

(def *-iron
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/IRON)

(def *-anvil
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/ANVIL)

(def *-water
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/WATER)

(def *-lava
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/LAVA)

(def *-leaves
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/LEAVES)

(def *-plants
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/PLANTS)

(def *-vine
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/VINE)

(def *-sponge
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/SPONGE)

(def *-cloth
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CLOTH)

(def *-fire
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/FIRE)

(def *-sand
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/SAND)

(def *-circuits
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CIRCUITS)

(def *-carpet
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CARPET)

(def *-glass
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/GLASS)

(def *-redstone-light
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/REDSTONE_LIGHT)

(def *-tnt
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/TNT)

(def *-coral
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CORAL)

(def *-ice
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/ICE)

(def *-packed-ice
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/PACKED_ICE)

(def *-snow
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/SNOW)

(def *-crafted-snow
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CRAFTED_SNOW)

(def *-cactus
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CACTUS)

(def *-clay
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CLAY)

(def *-gourd
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/GOURD)

(def *-dragon-egg
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/DRAGON_EGG)

(def *-portal
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/PORTAL)

(def *-cake
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/CAKE)

(def *-web
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/WEB)

(def *-piston
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/PISTON)

(def *-barrier
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/BARRIER)

(def *-structure-void
  "Static Constant.

  type: net.minecraft.block.material.Material"
  Material/STRUCTURE_VOID)

(defn opaque?
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.isOpaque))))

(defn tool-not-required?
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.isToolNotRequired))))

(defn get-can-burn?
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.getCanBurn))))

(defn solid?
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.isSolid))))

(defn set-replaceable
  "returns: `net.minecraft.block.material.Material`"
  (^net.minecraft.block.material.Material [^Material this]
    (-> this (.setReplaceable))))

(defn liquid?
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.isLiquid))))

(defn get-material-map-color
  "returns: `net.minecraft.block.material.MapColor`"
  (^net.minecraft.block.material.MapColor [^Material this]
    (-> this (.getMaterialMapColor))))

(defn get-mobility-flag
  "returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^Material this]
    (-> this (.getMobilityFlag))))

(defn blocks-movement
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.blocksMovement))))

(defn blocks-light
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.blocksLight))))

(defn replaceable?
  "returns: `boolean`"
  (^Boolean [^Material this]
    (-> this (.isReplaceable))))


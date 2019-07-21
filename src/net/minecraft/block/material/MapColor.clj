(ns net.minecraft.block.material.MapColor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.material MapColor]))

(def *-colors
  "Static Constant.

  type: net.minecraft.block.material.MapColor[]"
  MapColor/COLORS)

(def *-air
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/AIR)

(def *-grass
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/GRASS)

(def *-sand
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/SAND)

(def *-cloth
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/CLOTH)

(def *-tnt
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/TNT)

(def *-ice
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/ICE)

(def *-iron
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/IRON)

(def *-foliage
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/FOLIAGE)

(def *-snow
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/SNOW)

(def *-clay
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/CLAY)

(def *-dirt
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/DIRT)

(def *-stone
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/STONE)

(def *-water
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/WATER)

(def *-wood
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/WOOD)

(def *-quartz
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/QUARTZ)

(def *-adobe
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/ADOBE)

(def *-magenta
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/MAGENTA)

(def *-light-blue
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/LIGHT_BLUE)

(def *-yellow
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/YELLOW)

(def *-lime
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/LIME)

(def *-pink
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/PINK)

(def *-gray
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/GRAY)

(def *-silver
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/SILVER)

(def *-cyan
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/CYAN)

(def *-purple
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/PURPLE)

(def *-blue
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/BLUE)

(def *-brown
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/BROWN)

(def *-green
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/GREEN)

(def *-red
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/RED)

(def *-black
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/BLACK)

(def *-gold
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/GOLD)

(def *-diamond
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/DIAMOND)

(def *-lapis
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/LAPIS)

(def *-emerald
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/EMERALD)

(def *-obsidian
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/OBSIDIAN)

(def *-netherrack
  "Static Constant.

  type: net.minecraft.block.material.MapColor"
  MapColor/NETHERRACK)

(defn color-value
  "Instance Constant.

  type: int"
  (^Integer [^MapColor this]
    (-> this .-colorValue)))

(defn color-index
  "Instance Constant.

  type: int"
  (^Integer [^MapColor this]
    (-> this .-colorIndex)))

(defn get-map-color
  "index - `int`

  returns: `int`"
  (^Integer [^MapColor this ^Integer index]
    (-> this (.getMapColor index))))


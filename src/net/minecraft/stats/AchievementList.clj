(ns net.minecraft.stats.AchievementList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats AchievementList]))

(defn ->achievement-list
  "Constructor."
  (^AchievementList []
    (new AchievementList )))

(defn *-min-display-column
  "Static Field.

  type: int"
  []
  AchievementList/minDisplayColumn)

(defn *-min-display-row
  "Static Field.

  type: int"
  []
  AchievementList/minDisplayRow)

(defn *-max-display-column
  "Static Field.

  type: int"
  []
  AchievementList/maxDisplayColumn)

(defn *-max-display-row
  "Static Field.

  type: int"
  []
  AchievementList/maxDisplayRow)

(def *-achievements
  "Static Constant.

  type: java.util.List<net.minecraft.stats.Achievement>"
  AchievementList/ACHIEVEMENTS)

(def *-open-inventory
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/OPEN_INVENTORY)

(def *-mine-wood
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/MINE_WOOD)

(def *-build-work-bench
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BUILD_WORK_BENCH)

(def *-build-pickaxe
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BUILD_PICKAXE)

(def *-build-furnace
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BUILD_FURNACE)

(def *-acquire-iron
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/ACQUIRE_IRON)

(def *-build-hoe
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BUILD_HOE)

(def *-make-bread
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/MAKE_BREAD)

(def *-bake-cake
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BAKE_CAKE)

(def *-build-better-pickaxe
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BUILD_BETTER_PICKAXE)

(def *-cook-fish
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/COOK_FISH)

(def *-on-a-rail
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/ON_A_RAIL)

(def *-build-sword
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BUILD_SWORD)

(def *-kill-enemy
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/KILL_ENEMY)

(def *-kill-cow
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/KILL_COW)

(def *-fly-pig
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/FLY_PIG)

(def *-snipe-skeleton
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/SNIPE_SKELETON)

(def *-diamonds
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/DIAMONDS)

(def *-diamonds-to-you
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/DIAMONDS_TO_YOU)

(def *-portal
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/PORTAL)

(def *-ghast
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/GHAST)

(def *-blaze-rod
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BLAZE_ROD)

(def *-potion
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/POTION)

(def *-the-end
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/THE_END)

(def *-the-end-2
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/THE_END2)

(def *-enchantments
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/ENCHANTMENTS)

(def *-overkill
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/OVERKILL)

(def *-bookcase
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BOOKCASE)

(def *-breed-cow
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/BREED_COW)

(def *-spawn-wither
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/SPAWN_WITHER)

(def *-kill-wither
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/KILL_WITHER)

(def *-full-beacon
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/FULL_BEACON)

(def *-explore-all-biomes
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/EXPLORE_ALL_BIOMES)

(def *-overpowered
  "Static Constant.

  type: net.minecraft.stats.Achievement"
  AchievementList/OVERPOWERED)

(defn *init
  ""
  ([]
    (AchievementList/init )))


(ns net.minecraft.world.storage.loot.LootTableList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot LootTableList]))

(defn ->loot-table-list
  "Constructor."
  (^LootTableList []
    (new LootTableList )))

(def *-empty
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/EMPTY)

(def *-chests-spawn-bonus-chest
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_SPAWN_BONUS_CHEST)

(def *-chests-end-city-treasure
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_END_CITY_TREASURE)

(def *-chests-simple-dungeon
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_SIMPLE_DUNGEON)

(def *-chests-village-blacksmith
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_VILLAGE_BLACKSMITH)

(def *-chests-abandoned-mineshaft
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_ABANDONED_MINESHAFT)

(def *-chests-nether-bridge
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_NETHER_BRIDGE)

(def *-chests-stronghold-library
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_STRONGHOLD_LIBRARY)

(def *-chests-stronghold-crossing
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_STRONGHOLD_CROSSING)

(def *-chests-stronghold-corridor
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_STRONGHOLD_CORRIDOR)

(def *-chests-desert-pyramid
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_DESERT_PYRAMID)

(def *-chests-jungle-temple
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_JUNGLE_TEMPLE)

(def *-chests-jungle-temple-dispenser
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_JUNGLE_TEMPLE_DISPENSER)

(def *-chests-igloo-chest
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_IGLOO_CHEST)

(def *-chests-woodland-mansion
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/CHESTS_WOODLAND_MANSION)

(def *-entities-witch
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_WITCH)

(def *-entities-blaze
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_BLAZE)

(def *-entities-creeper
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_CREEPER)

(def *-entities-spider
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SPIDER)

(def *-entities-cave-spider
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_CAVE_SPIDER)

(def *-entities-giant
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_GIANT)

(def *-entities-silverfish
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SILVERFISH)

(def *-entities-enderman
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ENDERMAN)

(def *-entities-guardian
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_GUARDIAN)

(def *-entities-elder-guardian
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ELDER_GUARDIAN)

(def *-entities-shulker
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHULKER)

(def *-entities-iron-golem
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_IRON_GOLEM)

(def *-entities-snowman
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SNOWMAN)

(def *-entities-rabbit
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_RABBIT)

(def *-entities-chicken
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_CHICKEN)

(def *-entities-pig
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_PIG)

(def *-entities-polar-bear
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_POLAR_BEAR)

(def *-entities-horse
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_HORSE)

(def *-entities-donkey
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_DONKEY)

(def *-entities-mule
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_MULE)

(def *-entities-zombie-horse
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ZOMBIE_HORSE)

(def *-entities-skeleton-horse
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SKELETON_HORSE)

(def *-entities-cow
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_COW)

(def *-entities-mushroom-cow
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_MUSHROOM_COW)

(def *-entities-wolf
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_WOLF)

(def *-entities-ocelot
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_OCELOT)

(def *-entities-sheep
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP)

(def *-entities-sheep-white
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_WHITE)

(def *-entities-sheep-orange
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_ORANGE)

(def *-entities-sheep-magenta
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_MAGENTA)

(def *-entities-sheep-light-blue
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_LIGHT_BLUE)

(def *-entities-sheep-yellow
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_YELLOW)

(def *-entities-sheep-lime
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_LIME)

(def *-entities-sheep-pink
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_PINK)

(def *-entities-sheep-gray
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_GRAY)

(def *-entities-sheep-silver
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_SILVER)

(def *-entities-sheep-cyan
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_CYAN)

(def *-entities-sheep-purple
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_PURPLE)

(def *-entities-sheep-blue
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_BLUE)

(def *-entities-sheep-brown
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_BROWN)

(def *-entities-sheep-green
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_GREEN)

(def *-entities-sheep-red
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_RED)

(def *-entities-sheep-black
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SHEEP_BLACK)

(def *-entities-bat
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_BAT)

(def *-entities-slime
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SLIME)

(def *-entities-magma-cube
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_MAGMA_CUBE)

(def *-entities-ghast
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_GHAST)

(def *-entities-squid
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SQUID)

(def *-entities-endermite
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ENDERMITE)

(def *-entities-zombie
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ZOMBIE)

(def *-entities-zombie-pigman
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ZOMBIE_PIGMAN)

(def *-entities-skeleton
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_SKELETON)

(def *-entities-wither-skeleton
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_WITHER_SKELETON)

(def *-entities-stray
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_STRAY)

(def *-entities-husk
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_HUSK)

(def *-entities-zombie-villager
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ZOMBIE_VILLAGER)

(def *-entities-villager
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_VILLAGER)

(def *-entities-evocation-illager
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_EVOCATION_ILLAGER)

(def *-entities-vindication-illager
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_VINDICATION_ILLAGER)

(def *-entities-llama
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_LLAMA)

(def *-entities-vex
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_VEX)

(def *-entities-ender-dragon
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/ENTITIES_ENDER_DRAGON)

(def *-gameplay-fishing
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/GAMEPLAY_FISHING)

(def *-gameplay-fishing-junk
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/GAMEPLAY_FISHING_JUNK)

(def *-gameplay-fishing-treasure
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/GAMEPLAY_FISHING_TREASURE)

(def *-gameplay-fishing-fish
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  LootTableList/GAMEPLAY_FISHING_FISH)

(defn *register
  "id - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^net.minecraft.util.ResourceLocation id]
    (LootTableList/register id)))

(defn *get-all
  "returns: `java.util.Set<net.minecraft.util.ResourceLocation>`"
  (^java.util.Set []
    (LootTableList/getAll )))


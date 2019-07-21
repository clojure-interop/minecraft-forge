(ns net.minecraft.stats.StatList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.stats StatList]))

(defn ->stat-list
  "Constructor."
  (^StatList []
    (new StatList )))

(def *-all-stats
  "Static Constant.

  type: java.util.List<net.minecraft.stats.StatBase>"
  StatList/ALL_STATS)

(def *-basic-stats
  "Static Constant.

  type: java.util.List<net.minecraft.stats.StatBase>"
  StatList/BASIC_STATS)

(def *-use-item-stats
  "Static Constant.

  type: java.util.List<net.minecraft.stats.StatCrafting>"
  StatList/USE_ITEM_STATS)

(def *-mine-block-stats
  "Static Constant.

  type: java.util.List<net.minecraft.stats.StatCrafting>"
  StatList/MINE_BLOCK_STATS)

(def *-leave-game
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/LEAVE_GAME)

(def *-play-one-minute
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/PLAY_ONE_MINUTE)

(def *-time-since-death
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/TIME_SINCE_DEATH)

(def *-sneak-time
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/SNEAK_TIME)

(def *-walk-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/WALK_ONE_CM)

(def *-crouch-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/CROUCH_ONE_CM)

(def *-sprint-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/SPRINT_ONE_CM)

(def *-swim-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/SWIM_ONE_CM)

(def *-fall-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/FALL_ONE_CM)

(def *-climb-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/CLIMB_ONE_CM)

(def *-fly-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/FLY_ONE_CM)

(def *-dive-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/DIVE_ONE_CM)

(def *-minecart-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/MINECART_ONE_CM)

(def *-boat-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/BOAT_ONE_CM)

(def *-pig-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/PIG_ONE_CM)

(def *-horse-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/HORSE_ONE_CM)

(def *-aviate-one-cm
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/AVIATE_ONE_CM)

(def *-jump
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/JUMP)

(def *-drop
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/DROP)

(def *-damage-dealt
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/DAMAGE_DEALT)

(def *-damage-taken
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/DAMAGE_TAKEN)

(def *-deaths
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/DEATHS)

(def *-mob-kills
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/MOB_KILLS)

(def *-animals-bred
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/ANIMALS_BRED)

(def *-player-kills
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/PLAYER_KILLS)

(def *-fish-caught
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/FISH_CAUGHT)

(def *-talked-to-villager
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/TALKED_TO_VILLAGER)

(def *-traded-with-villager
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/TRADED_WITH_VILLAGER)

(def *-cake-slices-eaten
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/CAKE_SLICES_EATEN)

(def *-cauldron-filled
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/CAULDRON_FILLED)

(def *-cauldron-used
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/CAULDRON_USED)

(def *-armor-cleaned
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/ARMOR_CLEANED)

(def *-banner-cleaned
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/BANNER_CLEANED)

(def *-brewingstand-interaction
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/BREWINGSTAND_INTERACTION)

(def *-beacon-interaction
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/BEACON_INTERACTION)

(def *-dropper-inspected
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/DROPPER_INSPECTED)

(def *-hopper-inspected
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/HOPPER_INSPECTED)

(def *-dispenser-inspected
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/DISPENSER_INSPECTED)

(def *-noteblock-played
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/NOTEBLOCK_PLAYED)

(def *-noteblock-tuned
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/NOTEBLOCK_TUNED)

(def *-flower-potted
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/FLOWER_POTTED)

(def *-trapped-chest-triggered
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/TRAPPED_CHEST_TRIGGERED)

(def *-enderchest-opened
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/ENDERCHEST_OPENED)

(def *-item-enchanted
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/ITEM_ENCHANTED)

(def *-record-played
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/RECORD_PLAYED)

(def *-furnace-interaction
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/FURNACE_INTERACTION)

(def *-crafting-table-interaction
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/CRAFTING_TABLE_INTERACTION)

(def *-chest-opened
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/CHEST_OPENED)

(def *-sleep-in-bed
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/SLEEP_IN_BED)

(def *-open-shulker-box
  "Static Constant.

  type: net.minecraft.stats.StatBase"
  StatList/OPEN_SHULKER_BOX)

(defn *get-craft-stats
  "item-in - `net.minecraft.item.Item`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.item.Item item-in]
    (StatList/getCraftStats item-in)))

(defn *reinit
  "Deprecated."
  ([]
    (StatList/reinit )))

(defn *get-stat-kill-entity
  "egg-info - `net.minecraft.entity.EntityList$EntityEggInfo`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.entity.EntityList$EntityEggInfo egg-info]
    (StatList/getStatKillEntity egg-info)))

(defn *get-block-stats
  "block-in - `net.minecraft.block.Block`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.block.Block block-in]
    (StatList/getBlockStats block-in)))

(defn *get-objects-picked-up-stats
  "item-in - `net.minecraft.item.Item`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.item.Item item-in]
    (StatList/getObjectsPickedUpStats item-in)))

(defn *get-dropped-object-stats
  "item-in - `net.minecraft.item.Item`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.item.Item item-in]
    (StatList/getDroppedObjectStats item-in)))

(defn *init
  ""
  ([]
    (StatList/init )))

(defn *get-stat-entity-killed-by
  "egg-info - `net.minecraft.entity.EntityList$EntityEggInfo`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.entity.EntityList$EntityEggInfo egg-info]
    (StatList/getStatEntityKilledBy egg-info)))

(defn *get-one-shot-stat
  "stat-name - `java.lang.String`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^java.lang.String stat-name]
    (StatList/getOneShotStat stat-name)))

(defn *get-object-break-stats
  "item-in - `net.minecraft.item.Item`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.item.Item item-in]
    (StatList/getObjectBreakStats item-in)))

(defn *get-object-use-stats
  "item-in - `net.minecraft.item.Item`

  returns: `net.minecraft.stats.StatBase`"
  (^net.minecraft.stats.StatBase [^net.minecraft.item.Item item-in]
    (StatList/getObjectUseStats item-in)))


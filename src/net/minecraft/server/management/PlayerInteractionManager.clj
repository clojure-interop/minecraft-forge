(ns net.minecraft.server.management.PlayerInteractionManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.management PlayerInteractionManager]))

(defn ->player-interaction-manager
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^PlayerInteractionManager [^net.minecraft.world.World world-in]
    (new PlayerInteractionManager world-in)))

(defn world
  "Instance Field.

  type: net.minecraft.world.World"
  (^net.minecraft.world.World [^PlayerInteractionManager this]
    (-> this .-world)))

(defn player
  "Instance Field.

  type: net.minecraft.entity.player.EntityPlayerMP"
  (^net.minecraft.entity.player.EntityPlayerMP [^PlayerInteractionManager this]
    (-> this .-player)))

(defn block-removing
  "pos - `net.minecraft.util.math.BlockPos`"
  ([^PlayerInteractionManager this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.blockRemoving pos))))

(defn get-block-reach-distance
  "returns: `double`"
  (^Double [^PlayerInteractionManager this]
    (-> this (.getBlockReachDistance))))

(defn process-right-click-block
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`
  pos - `net.minecraft.util.math.BlockPos`
  facing - `net.minecraft.util.EnumFacing`
  hit-x - `float`
  hit-y - `float`
  hit-z - `float`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^PlayerInteractionManager this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing facing ^Float hit-x ^Float hit-y ^Float hit-z]
    (-> this (.processRightClickBlock player world-in stack hand pos facing hit-x hit-y hit-z))))

(defn set-world
  "server-world - `net.minecraft.world.WorldServer`"
  ([^PlayerInteractionManager this ^net.minecraft.world.WorldServer server-world]
    (-> this (.setWorld server-world))))

(defn initialize-game-type
  "type - `net.minecraft.world.GameType`"
  ([^PlayerInteractionManager this ^net.minecraft.world.GameType type]
    (-> this (.initializeGameType type))))

(defn creative?
  "returns: `boolean`"
  (^Boolean [^PlayerInteractionManager this]
    (-> this (.isCreative))))

(defn cancel-destroying-block
  ""
  ([^PlayerInteractionManager this]
    (-> this (.cancelDestroyingBlock))))

(defn process-right-click
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  stack - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.EnumActionResult`"
  (^net.minecraft.util.EnumActionResult [^PlayerInteractionManager this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.item.ItemStack stack ^net.minecraft.util.EnumHand hand]
    (-> this (.processRightClick player world-in stack hand))))

(defn on-block-clicked
  "pos - `net.minecraft.util.math.BlockPos`
  side - `net.minecraft.util.EnumFacing`"
  ([^PlayerInteractionManager this ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing side]
    (-> this (.onBlockClicked pos side))))

(defn try-harvest-block
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^PlayerInteractionManager this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.tryHarvestBlock pos))))

(defn update-block-removing
  ""
  ([^PlayerInteractionManager this]
    (-> this (.updateBlockRemoving))))

(defn survival-or-adventure
  "returns: `boolean`"
  (^Boolean [^PlayerInteractionManager this]
    (-> this (.survivalOrAdventure))))

(defn set-block-reach-distance
  "distance - `double`"
  ([^PlayerInteractionManager this ^Double distance]
    (-> this (.setBlockReachDistance distance))))

(defn set-game-type
  "type - `net.minecraft.world.GameType`"
  ([^PlayerInteractionManager this ^net.minecraft.world.GameType type]
    (-> this (.setGameType type))))

(defn get-game-type
  "returns: `net.minecraft.world.GameType`"
  (^net.minecraft.world.GameType [^PlayerInteractionManager this]
    (-> this (.getGameType))))


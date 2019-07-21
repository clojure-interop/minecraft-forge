(ns net.minecraftforge.event.entity.player.PlayerEvent$HarvestCheck
  "HarvestCheck is fired when a player attempts to harvest a block.
  This event is fired whenever a player attempts to harvest a block in
  EntityPlayer.canHarvestBlock(IBlockState).

  This event is fired via the ForgeEventFactory.doPlayerHarvestCheck(EntityPlayer, IBlockState, boolean).

  state contains the IBlockState that is being checked for harvesting.
  success contains the boolean value for whether the Block will be successfully harvested.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$HarvestCheck]))

(defn ->harvest-check
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  state - `net.minecraft.block.state.IBlockState`
  success - `boolean`"
  (^PlayerEvent$HarvestCheck [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.block.state.IBlockState state ^Boolean success]
    (new PlayerEvent$HarvestCheck player state success)))

(defn get-target-block
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^PlayerEvent$HarvestCheck this]
    (-> this (.getTargetBlock))))

(defn can-harvest?
  "returns: `boolean`"
  (^Boolean [^PlayerEvent$HarvestCheck this]
    (-> this (.canHarvest))))

(defn set-can-harvest
  "success - `boolean`"
  ([^PlayerEvent$HarvestCheck this ^Boolean success]
    (-> this (.setCanHarvest success))))


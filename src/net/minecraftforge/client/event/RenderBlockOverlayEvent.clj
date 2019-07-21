(ns net.minecraftforge.client.event.RenderBlockOverlayEvent
  "Called when a block's texture is going to be overlaid on the player's HUD. Cancel this event to prevent the overlay."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderBlockOverlayEvent]))

(defn ->render-block-overlay-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  render-partial-ticks - `float`
  type - `net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType`
  block - `net.minecraft.block.state.IBlockState`
  block-pos - `net.minecraft.util.math.BlockPos`"
  (^RenderBlockOverlayEvent [^net.minecraft.entity.player.EntityPlayer player ^Float render-partial-ticks ^net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType type ^net.minecraft.block.state.IBlockState block ^net.minecraft.util.math.BlockPos block-pos]
    (new RenderBlockOverlayEvent player render-partial-ticks type block block-pos))
  (^RenderBlockOverlayEvent [^net.minecraft.entity.player.EntityPlayer player ^Float render-partial-ticks ^net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType type ^net.minecraft.block.Block block ^Integer x ^Integer y ^Integer z]
    (new RenderBlockOverlayEvent player render-partial-ticks type block x y z)))

(defn get-player
  "The player which the overlay will apply to

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^RenderBlockOverlayEvent this]
    (-> this (.getPlayer))))

(defn get-render-partial-ticks
  "returns: `float`"
  (^Float [^RenderBlockOverlayEvent this]
    (-> this (.getRenderPartialTicks))))

(defn get-overlay-type
  "The type of overlay to occur

  returns: `net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType`"
  (^net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType [^RenderBlockOverlayEvent this]
    (-> this (.getOverlayType))))

(defn get-block-for-overlay
  "If the overlay type is BLOCK, then this is the block which the overlay is getting it's icon from

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^RenderBlockOverlayEvent this]
    (-> this (.getBlockForOverlay))))

(defn get-block-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^RenderBlockOverlayEvent this]
    (-> this (.getBlockPos))))


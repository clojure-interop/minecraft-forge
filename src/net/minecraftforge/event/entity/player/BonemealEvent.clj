(ns net.minecraftforge.event.entity.player.BonemealEvent
  "This event is called when a player attempts to use Bonemeal on a block.
  It can be canceled to completely prevent any further processing.

  You can also set the result to ALLOW to mark the event as processed
  and use up a bonemeal from the stack but do no further processing.

  setResult(ALLOW) is the same as the old setHandled()"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player BonemealEvent]))

(defn ->bonemeal-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block - `net.minecraft.block.state.IBlockState`"
  (^BonemealEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState block]
    (new BonemealEvent player world pos block)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^BonemealEvent this]
    (-> this (.getWorld))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BonemealEvent this]
    (-> this (.getPos))))

(defn get-block
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BonemealEvent this]
    (-> this (.getBlock))))


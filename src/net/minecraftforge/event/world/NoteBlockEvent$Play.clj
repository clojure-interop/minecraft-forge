(ns net.minecraftforge.event.world.NoteBlockEvent$Play
  "Fired when a Noteblock plays it's note. You can override the note and instrument
  Canceling this event will stop the note from playing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world NoteBlockEvent$Play]))

(defn ->play
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  note - `int`
  instrument - `int`"
  (^NoteBlockEvent$Play [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer note ^Integer instrument]
    (new NoteBlockEvent$Play world pos state note instrument)))

(defn get-instrument
  "returns: `net.minecraftforge.event.world.NoteBlockEvent$Instrument`"
  (^net.minecraftforge.event.world.NoteBlockEvent$Instrument [^NoteBlockEvent$Play this]
    (-> this (.getInstrument))))

(defn set-instrument
  "instrument - `net.minecraftforge.event.world.NoteBlockEvent$Instrument`"
  ([^NoteBlockEvent$Play this ^net.minecraftforge.event.world.NoteBlockEvent$Instrument instrument]
    (-> this (.setInstrument instrument))))


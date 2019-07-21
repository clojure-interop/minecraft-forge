(ns net.minecraftforge.event.world.NoteBlockEvent$Change
  "Fired when a Noteblock is changed. You can adjust the note it will change to via NoteBlockEvent.setNote(Note, Octave).
  Canceling this event will not change the note and also stop the Noteblock from playing it's note."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world NoteBlockEvent$Change]))

(defn ->change
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  old-note - `int`
  new-note - `int`"
  (^NoteBlockEvent$Change [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^Integer old-note ^Integer new-note]
    (new NoteBlockEvent$Change world pos state old-note new-note)))

(defn get-old-note
  "returns: `net.minecraftforge.event.world.NoteBlockEvent$Note`"
  (^net.minecraftforge.event.world.NoteBlockEvent$Note [^NoteBlockEvent$Change this]
    (-> this (.getOldNote))))

(defn get-old-octave
  "returns: `net.minecraftforge.event.world.NoteBlockEvent$Octave`"
  (^net.minecraftforge.event.world.NoteBlockEvent$Octave [^NoteBlockEvent$Change this]
    (-> this (.getOldOctave))))


(ns net.minecraft.command.ICommandManager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command ICommandManager]))

(defn execute-command
  "sender - `net.minecraft.command.ICommandSender`
  raw-command - `java.lang.String`

  returns: `int`"
  (^Integer [^ICommandManager this ^net.minecraft.command.ICommandSender sender ^java.lang.String raw-command]
    (-> this (.executeCommand sender raw-command))))

(defn get-tab-completions
  "sender - `net.minecraft.command.ICommandSender`
  input - `java.lang.String`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ICommandManager this ^net.minecraft.command.ICommandSender sender ^java.lang.String input ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getTabCompletions sender input pos))))

(defn get-possible-commands
  "sender - `net.minecraft.command.ICommandSender`

  returns: `java.util.List<net.minecraft.command.ICommand>`"
  (^java.util.List [^ICommandManager this ^net.minecraft.command.ICommandSender sender]
    (-> this (.getPossibleCommands sender))))

(defn get-commands
  "returns: `java.util.Map<java.lang.String,net.minecraft.command.ICommand>`"
  (^java.util.Map [^ICommandManager this]
    (-> this (.getCommands))))


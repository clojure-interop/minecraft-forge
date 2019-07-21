(ns net.minecraftforge.event.CommandEvent
  "CommandEvent is fired whenever a command is scheduled to be executed.
  This event is fired during the invocation of CommandHandler.executeCommand(ICommandSender, String)
  and ClientCommandHandler.executeCommand(ICommandSender, String).

  command contains the instance of ICommand which is representative of the currently executing command.
  sender contains the instance of ICommandSender for the given command sender.
  parameters contains the arguments passed for the command execution.
  exception begins null, but can be populated with an exception to be thrown within the command.

  This event is Cancelable.
  If the event is canceled, the execution of the command does not occur.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event CommandEvent]))

(defn ->command-event
  "Constructor.

  command - `net.minecraft.command.ICommand`
  sender - `net.minecraft.command.ICommandSender`
  parameters - `java.lang.String[]`"
  (^CommandEvent [^net.minecraft.command.ICommand command ^net.minecraft.command.ICommandSender sender parameters]
    (new CommandEvent command sender parameters)))

(defn get-command
  "returns: `net.minecraft.command.ICommand`"
  (^net.minecraft.command.ICommand [^CommandEvent this]
    (-> this (.getCommand))))

(defn get-sender
  "returns: `net.minecraft.command.ICommandSender`"
  (^net.minecraft.command.ICommandSender [^CommandEvent this]
    (-> this (.getSender))))

(defn get-parameters
  "returns: `java.lang.String[]`"
  ([^CommandEvent this]
    (-> this (.getParameters))))

(defn set-parameters
  "parameters - `java.lang.String[]`"
  ([^CommandEvent this parameters]
    (-> this (.setParameters parameters))))

(defn get-exception
  "returns: `java.lang.Throwable`"
  (^java.lang.Throwable [^CommandEvent this]
    (-> this (.getException))))

(defn set-exception
  "exception - `java.lang.Throwable`"
  ([^CommandEvent this ^java.lang.Throwable exception]
    (-> this (.setException exception))))


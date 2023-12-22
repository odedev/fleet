<?php

namespace App\Observers;

use App\Models\Situation;

class SituationObserver
{
    /**
     * Handle the Situation "created" event.
     */
    public function created(Situation $situation): void
    {
        //
    }

    /**
     * Handle the Situation "updated" event.
     */
    public function updated(Situation $situation): void
    {
        //
    }

    /**
     * Handle the Situation "deleted" event.
     */
    public function deleted(Situation $situation): void
    {
        //
    }

    /**
     * Handle the Situation "restored" event.
     */
    public function restored(Situation $situation): void
    {
        //
    }

    /**
     * Handle the Situation "force deleted" event.
     */
    public function forceDeleted(Situation $situation): void
    {
        //
    }
}

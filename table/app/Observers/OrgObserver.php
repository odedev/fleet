<?php

namespace App\Observers;

use App\Models\Org;

class OrgObserver
{
    /**
     * Handle the Org "created" event.
     */
    public function created(Org $org): void
    {
        //
    }

    /**
     * Handle the Org "updated" event.
     */
    public function updated(Org $org): void
    {
        //
    }

    /**
     * Handle the Org "deleted" event.
     */
    public function deleted(Org $org): void
    {
        //
    }

    /**
     * Handle the Org "restored" event.
     */
    public function restored(Org $org): void
    {
        //
    }

    /**
     * Handle the Org "force deleted" event.
     */
    public function forceDeleted(Org $org): void
    {
        //
    }
}

<?php

namespace App\Observers;

use App\Models\OrgUser;

class OrgUserObserver
{
    /**
     * Handle the OrgUser "created" event.
     */
    public function created(OrgUser $orgUser): void
    {
        //
    }

    /**
     * Handle the OrgUser "updated" event.
     */
    public function updated(OrgUser $orgUser): void
    {
        //
    }

    /**
     * Handle the OrgUser "deleted" event.
     */
    public function deleted(OrgUser $orgUser): void
    {
        //
    }

    /**
     * Handle the OrgUser "restored" event.
     */
    public function restored(OrgUser $orgUser): void
    {
        //
    }

    /**
     * Handle the OrgUser "force deleted" event.
     */
    public function forceDeleted(OrgUser $orgUser): void
    {
        //
    }
}
